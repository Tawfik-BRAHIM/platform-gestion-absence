import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutabsComponent } from './ajoutabs.component';

describe('AjoutabsComponent', () => {
  let component: AjoutabsComponent;
  let fixture: ComponentFixture<AjoutabsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AjoutabsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AjoutabsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
