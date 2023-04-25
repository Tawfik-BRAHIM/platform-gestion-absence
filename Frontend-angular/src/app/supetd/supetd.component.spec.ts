import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SupetdComponent } from './supetd.component';

describe('SupetdComponent', () => {
  let component: SupetdComponent;
  let fixture: ComponentFixture<SupetdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SupetdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SupetdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
